var App = angular.module('App',[]);

App.controller('deliveryndeleting',function ($http,$scope) {
    $http.get('/deliveryndeleting/get').then(function (response){
        $scope.deliveryndeleting=response.data;
        console.log(response);
    });
    this.insertToDeliveryNDeleting = function add() {
        var containmentOfABook = document.getElementById("ContainmentOfABook").value;
        var bookEdition = document.getElementById("BookEdition").value;
        var bookAuthor = document.getElementById("BookAuthor").value;
        var bookYear = document.getElementById("BookYear").value;
        var bookGenre = document.getElementById("BookGenre").value;
        var bookType = document.getElementById("BookType").value;
        var inventoryNumber = document.getElementById("InventoryNumber")

        var indexDeliveryAndDeleting = document.getElementById("DNDBookName").selectedIndex;
        var deliveryAndDeleting_id = document.getElementById("DNDBookName").options[indexDeliveryAndDeleting].value;

        var indexStoragePlace = document.getElementById("StoragePlace").selectedIndex;
        var storagePlace_id = document.getElementById("StoragePlace").options[indexStoragePlace].value;

        var indexLibrarianName = document.getElementById("LibrarianName").selectedIndex;
        var librarianName_id = document.getElementById("LibrarianName").options[indexLibrarianName].value;

        var indexStudentName = document.getElementById("StudentName").selectedIndex;
        var studentName_id = document.getElementById("StudentName").options[indexStudentName].value;



        var req = {
            method: 'POST',
            url: '/book/insert',
            data: {
                containmentOfABook:containmentOfABook,
                bookEdition:bookEdition,
                bookAuthor:bookAuthor,
                bookYear:bookYear,
                bookGenre:bookGenre,
                bookType:bookType,
                deliveryndeleting_id:deliveryAndDeleting_id,
                storageplace_id:storagePlace_id,
                librarian_id:librarianName_id,
                student_id:studentName_id,
                nventoryNumber:inventoryNumber

            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateBook = function startUpdate(idBook,containmentOfABook,bookEdition,bookAuthor,bookYear,bookGenre,bookType,deliveryndeleting,storageplace,librarian,student,inventorynumber) {
        document.getElementById("BookIdUPD").value = idBook;
        document.getElementById("ContainmentOfABookUPD").value = containmentOfABook;
        document.getElementById("BookEditionUPD").value = bookEdition;
        document.getElementById("BookAuthorUPD").value = bookAuthor;
        document.getElementById("BookYearUPD").value = bookYear;
        document.getElementById("BookGenreUPD").value = bookGenre;
        document.getElementById("BookTypeUPD").value = bookType;
        document.getElementById("InventoryNumberUPD").value = inventorynumber;

        $http.get('/student/get').then(function (response) {
            var students = response.data;
            var selector = document.getElementById("StudentNameUPD");
            $(selector).empty();
            for (var i = 0; i < students.length; i++) {
                var option = document.createElement("option");
                if (students[i].idStudents == student){
                    option.selected = 'selected';
                }
                option.text = students[i].StudentName;
                option.value = students[i].idStudent;
                selector.add(option);

            }
        });

        $http.get('/deliveryndeleting/get').then(function (response) {
            var deliveryndeletings = response.data;
            var selector = document.getElementById("DNDBookNameUPD");
            $(selector).empty();
            for (var i = 0; i < deliveryndeletings.length; i++) {
                var option = document.createElement("option");
                if (deliveryndeletings[i].idDeliveryNDeleting == deliveryndeleting){
                    option.selected = 'selected';
                }
                option.text = deliveryndeletings[i].BookName;
                option.value = deliveryndeletings[i].idDeliveryNDeleting;
                selector.add(option);

            }
        });

        $http.get('/storageplace/get').then(function (response) {
            var storageplaces = response.data;
            var selector = document.getElementById("StoragePlaceUPD");
            $(selector).empty();
            for (var i = 0; i < storageplaces.length; i++) {
                var option = document.createElement("option");
                if (storageplaces[i].idStoragePlace == storageplace){
                    option.selected = 'selected';
                }
                option.text = storageplaces[i].idStoragePlace;
                option.value = storageplaces[i].idStoragePlace;
                selector.add(option);

            }
        });

        $http.get('/librarian/get').then(function (response) {
            var librarians = response.data;
            var selector = document.getElementById("LibrarianNameUPD");
            $(selector).empty();
            for (var i = 0; i < librarians.length; i++) {
                var option = document.createElement("option");
                if (librarians[i].idLibrarians == librarian){
                    option.selected = 'selected';
                }
                option.text = librarians[i].LibrarianName;
                option.value = librarians[i].idLibrarian;
                selector.add(option);

            }
        });



    };

    this.updateBook = function update() {
        var id = document.getElementById("BookIdUPD").value = idBook;
        var containmentOfABook = document.getElementById("ContainmentOfABookUPD").value = containmentOfABook;
        var edition = document.getElementById("BookEditionUPD").value = bookEdition;
        var author = document.getElementById("BookAuthorUPD").value = bookAuthor;
        var year = document.getElementById("BookYearUPD").value = bookYear;
        var genre = document.getElementById("BookGenreUPD").value = bookGenre;
        var type = document.getElementById("BookTypeUPD").value = bookType;
        var innumber = document.getElementById("InventoryNumberUPD").value = inventorynumber;

        var req = {
            method: 'POST',
            url: '/book/update?id=' + id,
            data: {
                containmentOfABook:containmentOfABook,
                bookEdition:edition,
                bookAuthor:author,
                bookYear:year,
                bookGenre:genre,
                bookType:type,
                inventoryNumber: innumber

            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromBook = function del(id) {
        $http.get('/book/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

