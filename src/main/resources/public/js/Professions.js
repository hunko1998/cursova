var App = angular.module('App',[]);

App.controller('Professions',function ($http,$scope) {
    var time = performance.now();
    $http.get('/professions/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.professions=response.data;
        console.log(response);
    });


    this.insertToProfessions = function add() {
        var profession = document.getElementById("Profession").value;

        var req = {
            method: 'POST',
            url: '/professions/insert',
            data: {
                profession:profession

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

    this.startUpdateProfessions = function startUpdate(idProfessions,Professions) {
        document.getElementById("ProfessionsIdUPD").value = idProfessions;
        document.getElementById("ProfessionUPD").value = Professions;


    };

    this.updateProfessions = function update() {
        var id = document.getElementById("ProfessionsIdUPD").value;
        var profession = document.getElementById("ProfessionUPD").value;


        var req = {
            method: 'POST',
            url: '/professions/update?id=' + id,
            data: {
                profession: profession

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

    this.delFromProfessions = function del(id) {
        var time = performance.now();
        $http.get('/professions/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

