var App = angular.module('App',[]);

App.controller('Genres',function ($http,$scope) {
    var time = performance.now();
    $http.get('/genres/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.genres=response.data;
        console.log(response);
    });


    this.insertToGenres = function add() {
        var genre = document.getElementById("Genre").value;

        var req = {
            method: 'POST',
            url: '/genres/insert',
            data: {
                genre:genre

            }
        };
        console.log(req);
        var time = performance.now();
        $http(req).then(function (resp) {
            console.log(resp);
            time = performance.now() - time;
            console.log('Додавання новго запису = ', time);
            alert("-----");
            window.location.reload();
        })
    };

    this.startUpdateGenres = function startUpdate(idGenres,Genres) {
        document.getElementById("GenresIdUPD").value = idGenres;
        document.getElementById("GenreUPD").value = Genres;


    };

    this.updateGenres = function update() {
        var id = document.getElementById("GenresIdUPD").value;
        var genre = document.getElementById("GenreUPD").value;


        var req = {
            method: 'POST',
            url: '/genres/update?id=' + id,
            data: {
                genre: genre

            }
        };
        //console.log(req);
        var time = performance.now();
        $http(req).then(function (resp) {
            //console.log(resp);
            time = performance.now() - time;
            console.log('Оновлення = ', time);
            alert("--------");
            window.location.reload();
        })
    };

    this.delFromGenres = function del(id) {
        var time = performance.now();
        $http.get('/genres/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

