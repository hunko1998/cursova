var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request14 = [];
    var admin= "50";

    $http.get('http://localhost:8080/request/request14?admin='+admin).then(function (response){
        $scope.request14=response.data;
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
*/        document.getElementById("admin").value = admin;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        admin = document.getElementById("admin").value;

        $http.get('http://localhost:8080/request/request14?admin='+admin).then(function (response){
            $scope.request14=response.data;
            console.log(response);
        });
    };
});