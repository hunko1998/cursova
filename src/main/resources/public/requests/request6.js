var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request6 = [];
    var salary= '200';

    $http.get('http://localhost:8080/request/request6?salary='+salary).then(function (response){
        $scope.request6=response.data;
        console.log(response);
        /*$http.get('/storageplace/get').then(function (response){
            var storageplace = response.data;
            var selector = document.getElementById("StoragePlace");
            $(selector).empty();
            for (var i = 0; i < storageplace.length; i++) {
                var option = document.createElement("option");
                option.text = storageplace[i].idStoragePlace;
                option.value = storageplace[i].idStoragePlace;
                selector.add(option);
            }
            //selector.selectedIndex=0;
            selector.selectedIndex=2;
        });
*/        document.getElementById("salary").value = salary;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        salary = document.getElementById("salary").value;

        $http.get('http://localhost:8080/request/request6?salary='+salary).then(function (response){
            $scope.request6=response.data;
            console.log(response);
        });
    };
});