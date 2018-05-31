var App = angular.module('App',[]);

App.controller('Workers',function ($http,$scope) {
    var time = performance.now();
    $http.get('/workers/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.workers=response.data;
        console.log(response);
    });

    this.startInsertWorkers = function startUpdate() {
        $http.get('/professions/get').then(function (response) {
            var professions = response.data;
            var selector = document.getElementById("Professions");
            $(selector).empty();
            for (var i = 0; i < professions.length; i++) {
                var option = document.createElement("option");
                option.text = professions[i].idProfessions;
                option.value = professions[i].idProfessions;
                selector.add(option);

            }
        });

        $http.get('/roles/get').then(function (response) {
            var roles = response.data;
            var selector = document.getElementById("Roles");
            $(selector).empty();
            for (var i = 0; i < roles.length; i++) {
                var option = document.createElement("option");
                option.text = roles[i].idRoles;
                option.value = roles[i].idRoles;
                selector.add(option);

            }
        });


        $http.get('/tourings/get').then(function (response) {
            var tourings = response.data;
            var selector = document.getElementById("Tourings");
            $(selector).empty();
            for (var i = 0; i < tourings.length; i++) {
                var option = document.createElement("option");
                option.text = tourings[i].idTourings;
                option.value = tourings[i].idTourings;
                selector.add(option);

            }
        });

        $http.get('/ranks/get').then(function (response) {
            var ranks = response.data;
            var selector = document.getElementById("Ranks");
            $(selector).empty();
            for (var i = 0; i < ranks.length; i++) {
                var option = document.createElement("option");
                option.text = ranks[i].idRanks;
                option.value = ranks[i].idRanks;
                selector.add(option);

            }
        });
    };




    this.insertToWorkers = function add() {
        //TODO Set all the variables
        var name = document.getElementById("Name").value;
        var year = document.getElementById("Year").value;
        var experience = document.getElementById("Experience").value;
        var gender = document.getElementById("Gender").value;
        var children = document.getElementById("Children").value;
        var salary = document.getElementById("Salary").value;

        var indexRanks = document.getElementById("Ranks").selectedIndex;
        var Ranks_id = document.getElementById("Ranks").options[indexRanks].value;

        var indexTourings = document.getElementById("Tourings").selectedIndex;
        var tourings_id = document.getElementById("Tourings").options[indexTourings].value;

        var indexRole = document.getElementById("Roles").selectedIndex;
        var role_id = document.getElementById("Roles").options[indexRole].value;

        var indexProfessions = document.getElementById("Professions").selectedIndex;
        var professions_id = document.getElementById("Professions").options[indexProfessions].value;



        var req = {
            method: 'POST',
            url: '/workers/insert',
            data: {
                name:name,
                year:year,
                gender:gender,
                experience: experience,
                children:children,
                salary:salary,
                profession_idProf:professions_id,
                role_idRole:role_id,
                touring_idTouring:tourings_id,
                rank_idRank:Ranks_id




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

    this.startUpdateWorkers = function startUpdate(idWorkers,Name,Year,Experience,Gender,Children,Salary, role,profession,touring,rank) {
        document.getElementById("WorkersIdUPD").value = idWorkers;
        document.getElementById("NameUPD").value = Name;
        document.getElementById("YearUPD").value = Year;
        document.getElementById("GenderUPD").value = Gender;
        document.getElementById("ChildrenUPD").value = Children;
        document.getElementById("SalaryUPD").value = Salary;
        document.getElementById("ExperienceUPD").value = Experience;



        $http.get('/roles/get').then(function (response) {
            var roles = response.data;
            var selector = document.getElementById("RolesUPD");
            $(selector).empty();
            for (var i = 0; i < roles.length; i++) {
                var option = document.createElement("option");
                if (roles[i].idRoles == role){
                    option.selected = 'selected';
                }
                option.text = roles[i].idRoles;
                option.value = roles[i].idRoles;
                selector.add(option);

            }
        });
        $http.get('/professions/get').then(function (response) {
            var professions = response.data;
            var selector = document.getElementById("ProfessionsUPD");
            $(selector).empty();
            for (var i = 0; i < professions.length; i++) {
                var option = document.createElement("option");
                if (professions[i].idRoles == profession){
                    option.selected = 'selected';
                }
                option.text = professions[i].idProfessions;
                option.value = professions[i].idProfessions;
                selector.add(option);

            }
        });

        $http.get('/tourings/get').then(function (response) {
            var tourings = response.data;
            var selector = document.getElementById("TouringsUPD");
            $(selector).empty();
            for (var i = 0; i < tourings.length; i++) {
                var option = document.createElement("option");
                if (tourings[i].idTourings == touring){
                    option.selected = 'selected';
                }
                option.text = tourings[i].idTourings;
                option.value = tourings[i].idTourings;
                selector.add(option);

            }
        });

        $http.get('/ranks/get').then(function (response) {
            var ranks = response.data;
            var selector = document.getElementById("RanksUPD");
            $(selector).empty();
            for (var i = 0; i < ranks.length; i++) {
                var option = document.createElement("option");
                if (ranks[i].idRanks == rank){
                    option.selected = 'selected';
                }
                option.text = ranks[i].idRanks;
                option.value = ranks[i].idRanks;
                selector.add(option);

            }
        });


    };

    this.updateWorkers = function update() {
        var id = document.getElementById("WorkersIdUPD").value;
        var name = document.getElementById("NameUPD").value;
        var year = document.getElementById("YearUPD").value;
        var experience = document.getElementById("ExperienceUPD").value;
        var gender = document.getElementById("GenderUPD").value;
        var children = document.getElementById("ChildrenUPD").value;
        var salary = document.getElementById("SalaryUPD").value;

        var indexRanks = document.getElementById("RanksUPD").selectedIndex;
        var Ranks_id = document.getElementById("RanksUPD").options[indexRanks].value;

        var indexTourings = document.getElementById("TouringsUPD").selectedIndex;
        var tourings_id = document.getElementById("TouringsUPD").options[indexTourings].value;

        var indexRole = document.getElementById("RolesUPD").selectedIndex;
        var role_id = document.getElementById("RolesUPD").options[indexRole].value;

        var indexProfessions = document.getElementById("ProfessionsUPD").selectedIndex;
        var professions_id = document.getElementById("ProfessionsUPD").options[indexProfessions].value;

        var req = {
            method: 'POST',
            url: '/workers/update?id=' + id,
            data: {
                name:name,
                year:year,
                gender:gender,
                experience: experience,
                children:children,
                salary:salary,
                profession_idProf:professions_id,
                role_idRole:role_id,
                touring_idTouring:tourings_id,
                rank_idRank:Ranks_id




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

    this.delFromWorkers = function del(id) {
        var time = performance.now();
        $http.get('/workers/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

