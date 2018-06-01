var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request4 = [];
    var year= '1998';

    $http.get('/request/request4?year='+year).then(function (response){
        $scope.request4=response.data;
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
*/        document.getElementById("year").value = year;

    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        year = document.getElementById("year").value;

        $http.get('/request/request4?year='+year).then(function (response){
            $scope.request4=response.data;
            console.log(response);
        });
    };
});