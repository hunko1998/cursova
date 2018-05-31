var App = angular.module('App',[]);

App.controller('Cashboxs',function ($http,$scope) {
    var time = performance.now();
    $http.get('/cashboxs/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.cashboxs=response.data;
        console.log(response);
    });


    this.insertToCashboxs = function add() {
        var cashbox = document.getElementById("Cashbox").value;

        var req = {
            method: 'POST',
            url: '/cashboxs/insert',
            data: {
                cashbox:cashbox

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

    this.startUpdateCashboxs = function startUpdate(idCashboxs,Cashboxs) {
        document.getElementById("CashboxsIdUPD").value = idCashboxs;
        document.getElementById("CashboxUPD").value = Cashboxs;


    };

    this.updateCashboxs = function update() {
        var id = document.getElementById("CashboxsIdUPD").value;
        var cashbox = document.getElementById("CashboxUPD").value;


        var req = {
            method: 'POST',
            url: '/cashboxs/update?id=' + id,
            data: {
                cashbox: cashbox

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

    this.delFromCashboxs = function del(id) {
        var time = performance.now();
        $http.get('/cashboxs/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

