var App = angular.module('App',[]);

App.controller('Authors',function ($http,$scope) {
    $http.get('/authors/get').then(function (response){
        $scope.authors=response.data;
        console.log(response);
    });

    this.startInsertAuthors = function startUpdate() {
        $http.get('/genres/get').then(function (response) {
            var genres = response.data;
            var selector = document.getElementById("Genres");
            $(selector).empty();
            for (var i = 0; i < genres.length; i++) {
                var option = document.createElement("option");
                option.text = genres[i].idGenres;
                option.value = genres[i].idGenres;
                selector.add(option);

            }
        });

    };


    this.insertToAuthors = function add() {
        var author = document.getElementById("Author").value;
        var country = document.getElementById("Country").value;


        var indexGenres = document.getElementById("Genres").selectedIndex;
        var genres_id = document.getElementById("Genres").options[indexGenres].value;



        var req = {
            method: 'POST',
            url: '/authors/insert',
            data: {
                author:author,
                country:country,
                genres_idGenres:genres_id

            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateAuthors = function startUpdate(idAuthors,author,country,genre) {
        document.getElementById("AuthorsIdUPD").value = idAuthors;
        document.getElementById("AuthorUPD").value = author;
        document.getElementById("CountryUPD").value = country;


        $http.get('/genres/get').then(function (response) {
            var genres = response.data;
            var selector = document.getElementById("GenresUPD");
            $(selector).empty();
            for (var i = 0; i < genres.length; i++) {
                var option = document.createElement("option");
                if (genres[i].idGenres == genre){
                    option.selected = 'selected';
                }
                option.text = genres[i].idGenres;
                option.value = genres[i].idGenres;
                selector.add(option);

            }
        });

    };

    this.updateAuthors = function update() {
        var id = document.getElementById("AuthorsIdUPD").value;
        var author = document.getElementById("AuthorUPD").value;
        var country = document.getElementById("CountryUPD").value;


        var indexGenres= document.getElementById("GenresUPD").selectedIndex;
        var genres_id = document.getElementById("GenresUPD").options[indexGenres].value;



        var req = {
            method: 'POST',
            url: '/authors/update?id=' + id,
            data: {
                author:author,
                country:country,
                genres_idGenres:genres_id



            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromAuthors = function del(id) {
        $http.get('/authors/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

