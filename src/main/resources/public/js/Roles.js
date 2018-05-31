var App = angular.module('App',[]);

App.controller('Roles',function ($http,$scope) {
    var time = performance.now();
    $http.get('/roles/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.roles=response.data;
        console.log(response);
    });


    this.insertToRoles = function add() {
        var role = document.getElementById("Role").value;

        var req = {
            method: 'POST',
            url: '/roles/insert',
            data: {
                role:role

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

    this.startUpdateRoles = function startUpdate(idRoles,Roles) {
        document.getElementById("RolesIdUPD").value = idRoles;
        document.getElementById("RoleUPD").value = Roles;


    };

    this.updateRoles = function update() {
        var id = document.getElementById("RolesIdUPD").value;
        var role = document.getElementById("RoleUPD").value;


        var req = {
            method: 'POST',
            url: '/roles/update?id=' + id,
            data: {
                role: role

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

    this.delFromRoles = function del(id) {
        var time = performance.now();
        $http.get('/roles/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

