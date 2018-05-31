var App = angular.module('App',[]);

App.controller('Periods',function ($http,$scope) {
    var time = performance.now();
    $http.get('/periods/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.periods=response.data;
        console.log(response);
    });


    this.insertToPeriods = function add() {
        var period = document.getElementById("Period").value;

        var req = {
            method: 'POST',
            url: '/periods/insert',
            data: {
                period:period

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

    this.startUpdatePeriods = function startUpdate(idPeriods,Periods) {
        document.getElementById("PeriodsIdUPD").value = idPeriods;
        document.getElementById("PeriodUPD").value = Periods;


    };

    this.updatePeriods = function update() {
        var id = document.getElementById("PeriodsIdUPD").value;
        var period = document.getElementById("PeriodUPD").value;


        var req = {
            method: 'POST',
            url: '/periods/update?id=' + id,
            data: {
                period: period

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

    this.delFromPeriods = function del(id) {
        var time = performance.now();
        $http.get('/periods/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

