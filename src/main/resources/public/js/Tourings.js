var App = angular.module('App',[]);

App.controller('Tourings',function ($http,$scope) {
    var time = performance.now();
    $http.get('/tourings/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.tourings=response.data;
        console.log(response);
    });


    this.insertToTourings= function add() {
        var touring = document.getElementById("Touring").value;
        var month = document.getElementById("Month").value;

        var req = {
            method: 'POST',
            url: '/tourings/insert',
            data: {
                city:touring,
                month:month

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

    this.startUpdateTourings = function startUpdate(idTourings,Tourings,month) {
        document.getElementById("TouringsIdUPD").value = idTourings;
        document.getElementById("TouringUPD").value = Tourings;
        document.getElementById("MonthUPD").value = month;


    };

    this.updateTourings = function update() {
        var id = document.getElementById("TouringsIdUPD").value;
        var touring = document.getElementById("TouringUPD").value;
        var month = document.getElementById("Month").value;


        var req = {
            method: 'POST',
            url: '/tourings/update?id=' + id,
            data: {
                city: touring,
                month: month

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

    this.delFromTourings = function del(id) {
        var time = performance.now();
        $http.get('/ranks/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

