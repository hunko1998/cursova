var app = angular.module("kursova", []);

app.controller("AppCtrl", function ($http, $scope){
    $scope.request9 = [];
    var genre= 'rock';
    var period = "1st";

    $http.get('http://localhost:8080/request/request9?genre='+genre+'&period=' + period).then(function (response){
        $scope.request9=response.data;
        console.log(response);
        document.getElementById("genre").value = genre;
        document.getElementById("period").value= period;


    });

    this.update_request = function add() {
        /* var index = document.getElementById("StoragePlace").selectedIndex;
         idStoragePlace= document.getElementById("StoragePlace").options[index].value;*/
        genre = document.getElementById("genre").value;
        period = document.getElementById("period").value;


        $http.get('http://localhost:8080/request/request9?genre='+genre+ '&period='+period).then(function (response){
            $scope.request9=response.data;
            console.log(response);
        });
    };
});