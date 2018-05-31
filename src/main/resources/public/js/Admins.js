var App = angular.module('App',[]);

App.controller('Admins',function ($http,$scope) {
    var time = performance.now();
    $http.get('/admins/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.admins=response.data;
        console.log(response);
    });


    this.insertToAdmins = function add() {
        var admin = document.getElementById("Admin").value;
        var amount = document.getElementById("Amount").value;
        var sold = document.getElementById("Sold").value;

        var req = {
            method: 'POST',
            url: '/admins/insert',
            data: {
                admin:admin,
                amount:amount,
                sold:sold

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

    this.startUpdateAdmins = function startUpdate(idAdmins,Admin,Amount,Sold) {
        document.getElementById("AdminsIdUPD").value = idAdmins;
        document.getElementById("AdminUPD").value = Admin;
        document.getElementById("AmountUPD").value = Amount;
        document.getElementById("SoldUPD").value = Sold;


    };

    this.updateAdmins = function update() {
        var id = document.getElementById("AdminsIdUPD").value;
        var admin = document.getElementById("AdminUPD").value;
        var amount = document.getElementById("AmountUPD").value;
        var sold = document.getElementById("SoldUPD").value;


        var req = {
            method: 'POST',
            url: '/admins/update?id=' + id,
            data: {
                admin:admin,
                amount:amount,
                sold:sold

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

    this.delFromAdmins = function del(id) {
        var time = performance.now();
        $http.get('/admins/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

