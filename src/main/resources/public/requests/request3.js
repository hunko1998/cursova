var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request3 = [];
    var gender= 'male';

    $http.get('/request/request3?gender='+gender).then(function (response){
        $scope.request3=response.data;
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
*/        document.getElementById("gender").value = gender;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        gender = document.getElementById("gender").value;

        $http.get('/request/request3?gender='+gender).then(function (response){
            $scope.request3=response.data;
            console.log(response);
        });
    };
});