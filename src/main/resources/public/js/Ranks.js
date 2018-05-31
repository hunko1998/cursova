var App = angular.module('App',[]);

App.controller('Ranks',function ($http,$scope) {
    var time = performance.now();
    $http.get('/ranks/get').then(function (response){
        time = performance.now() - time;
        console.log('Час виконанння = ', time);
        alert("-----");
        $scope.ranks=response.data;
        console.log(response);
    });


    this.insertToRanks = function add() {
        var rank = document.getElementById("Rank").value;

        var req = {
            method: 'POST',
            url: '/ranks/insert',
            data: {
                rank:rank

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

    this.startUpdateRanks = function startUpdate(idRanks,Ranks) {
        document.getElementById("RanksIdUPD").value = idRanks;
        document.getElementById("RankUPD").value = Ranks;


    };

    this.updateRanks = function update() {
        var id = document.getElementById("RanksIdUPD").value;
        var rank = document.getElementById("RankUPD").value;


        var req = {
            method: 'POST',
            url: '/ranks/update?id=' + id,
            data: {
                rank: rank

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

    this.delFromRanks = function del(id) {
        var time = performance.now();
        $http.get('/ranks/del?id=' + id).then(function () {
            time = performance.now() - time;
            console.log('Видалення = ', time);
            alert("--------");
            window.location.reload();
        });
    };
});

