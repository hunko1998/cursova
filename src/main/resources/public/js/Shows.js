var App = angular.module('App',[]);

App.controller('Shows',function ($http,$scope) {
    var time = performance.now();
    $http.get('/shows/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.shows=response.data;
        console.log(response);
    });

    this.startInsertShows = function startUpdate() {
        $http.get('/authors/get').then(function (response) {
            var authors = response.data;
            var selector = document.getElementById("Authors");
            $(selector).empty();
            for (var i = 0; i < authors.length; i++) {
                var option = document.createElement("option");
                option.text = authors[i].idAuthors;
                option.value = authors[i].idAuthors;
                selector.add(option);

            }
        });

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


        $http.get('/periods/get').then(function (response) {
            var periods = response.data;
            var selector = document.getElementById("Periods");
            $(selector).empty();
            for (var i = 0; i < periods.length; i++) {
                var option = document.createElement("option");
                option.text = periods[i].idPeriods;
                option.value = periods[i].idPeriods;
                selector.add(option);

            }
        });

        $http.get('/cashboxs/get').then(function (response) {
            var cashboxs = response.data;
            var selector = document.getElementById("Cashboxs");
            $(selector).empty();
            for (var i = 0; i < cashboxs.length; i++) {
                var option = document.createElement("option");
                option.text = cashboxs[i].idCashboxs;
                option.value = cashboxs[i].idCashboxs;
                selector.add(option);

            }
        });

        $http.get('/admins/get').then(function (response) {
            var admins = response.data;
            var selector = document.getElementById("Admins");
            $(selector).empty();
            for (var i = 0; i < admins.length; i++) {
                var option = document.createElement("option");
                option.text = admins[i].idAdmins;
                option.value = admins[i].idAdmins;
                selector.add(option);

            }
        });
    };




    this.insertToShows = function add() {
        //TODO Set all the variables
        var show = document.getElementById("Show").value;
        var seasons = document.getElementById("Seasons").value;
        if(document.getElementById("Played").value == true)
        var played = 1;
        else var played=0;
        var age = document.getElementById("Age").value;
        var premier = document.getElementById("Premier").value;
        var premierdate = document.getElementById("Preimerdate").value;
        var subtype = document.getElementById("Subtype").value;

        var indexAuthors = document.getElementById("Authors").selectedIndex;
        var authors_id = document.getElementById("Authors").options[indexAuthors].value;

        var indexGenres = document.getElementById("Genres").selectedIndex;
        var genres_id = document.getElementById("Genres").options[indexGenres].value;

        var indexPeriods = document.getElementById("Periods").selectedIndex;
        var periods_id = document.getElementById("Periods").options[indexPeriods].value;

        var indexCashboxs = document.getElementById("Cashboxs").selectedIndex;
        var cashboxs_id = document.getElementById("Cashboxs").options[indexCashboxs].value;

        var indexAdmins = document.getElementById("Admins").selectedIndex;
        var admins_id = document.getElementById("Admins").options[indexAdmins].value;



        var req = {
            method: 'POST',
            url: '/shows/insert',
            data: {
                show:show,
                seasons:seasons,
                played:1,
                age: age,
                premier:premier,
                premierdate:premierdate,
                subtype:subtype,
                authors_idAuthors:authors_id,
                genres_idGenres:genres_id,
                period_idPeriod:periods_id,
                cashbox_idCashbox:cashboxs_id,
                admin_idAdmin:admins_id




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

    this.startUpdateShows = function startUpdate(idShows,Show,Year,Seasons,Played,Age,Premier,Premierdate,Subtype,author,genre,period,cashbox,admin) {
        document.getElementById("ShowsIdUPD").value = idShows;
        document.getElementById("ShowUPD").value = Show;
        document.getElementById("SeasonsUPD").value = Seasons;
        document.getElementById("PlayedUPD").value = Played;
        document.getElementById("AgeUPD").value = Age;
        document.getElementById("PremierUPD").value = Premier;
        document.getElementById("PremierdateUPD").value = Premierdate;
        document.getElementById("SubtypeUPD").value = Subtype;



        $http.get('/authors/get').then(function (response) {
            var authors = response.data;
            var selector = document.getElementById("AuthorsUPD");
            $(selector).empty();
            for (var i = 0; i < authors.length; i++) {
                var option = document.createElement("option");
                if (authors[i].idAuthors == author){
                    option.selected = 'selected';
                }
                option.text = authors[i].idAuthors;
                option.value = authors[i].idAuthors;
                selector.add(option);

            }
        });
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

        $http.get('/periods/get').then(function (response) {
            var periods = response.data;
            var selector = document.getElementById("PeriodsUPD");
            $(selector).empty();
            for (var i = 0; i < periods.length; i++) {
                var option = document.createElement("option");
                if (periods[i].idPeriods == period){
                    option.selected = 'selected';
                }
                option.text = periods[i].idPeriods;
                option.value = periods[i].idPeriods;
                selector.add(option);

            }
        });

        $http.get('/cashboxs/get').then(function (response) {
            var cashboxs = response.data;
            var selector = document.getElementById("CashboxsUPD");
            $(selector).empty();
            for (var i = 0; i < cashboxs.length; i++) {
                var option = document.createElement("option");
                if (cashboxs[i].idCashboxs == cashbox){
                    option.selected = 'selected';
                }
                option.text = cashboxs[i].idCashboxs;
                option.value = cashboxs[i].idCashboxs;
                selector.add(option);

            }
        });

        $http.get('/admins/get').then(function (response) {
            var admins = response.data;
            var selector = document.getElementById("AdminsUPD");
            $(selector).empty();
            for (var i = 0; i < admins.length; i++) {
                var option = document.createElement("option");
                if (admins[i].idAdmins == admin){
                    option.selected = 'selected';
                }
                option.text = admins[i].idAdmins;
                option.value = admins[i].idAdmins;
                selector.add(option);

            }
        });


    };

    this.updateShows= function update() {
        var id = document.getElementById("ShowsIdUPD").value;
        var show = document.getElementById("ShowUPD").value;
        var seasons = document.getElementById("SeasonsUPD").value;
        if(document.getElementById("PlayedUPD").value == true)
            var played = 1;
        else var played=0;
        var age = document.getElementById("AgeUPD").value;
        var premier = document.getElementById("PremierUPD").value;
        var premierdate = document.getElementById("PremierdateUPD").value;
        var subtype = document.getElementById("SubtypeUPD").value;

        var indexAuthors = document.getElementById("AuthorsUPD").selectedIndex;
        var authors_id = document.getElementById("AuthorsUPD").options[indexAuthors].value;

        var indexGenres = document.getElementById("GenresUPD").selectedIndex;
        var genres_id = document.getElementById("GenresUPD").options[indexGenres].value;

        var indexPeriods = document.getElementById("PeriodsUPD").selectedIndex;
        var periods_id = document.getElementById("PeriodsUPD").options[indexPeriods].value;

        var indexCashboxs = document.getElementById("CashboxsUPD").selectedIndex;
        var cashboxs_id = document.getElementById("CashboxsUPD").options[indexCashboxs].value;

        var indexAdmins = document.getElementById("AdminsUPD").selectedIndex;
        var admins_id = document.getElementById("AdminsUPD").options[indexAdmins].value;

        var req = {
            method: 'POST',
            url: '/shows/update?id=' + id,
            data: {
                show:show,
                seasons:seasons,
                played:"1",
                age: age,
                premier:premier,
                premierdate:premierdate,
                subtype:subtype,
                authors_idAuthors:authors_id,
                genres_idGenres:genres_id,
                period_idPeriod:periods_id,
                cashbox_idCashbox:cashboxs_id,
                admin_idAdmin:admins_id



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

    this.delFromShows = function del(id) {
        var time = performance.now();
        $http.get('/shows/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

