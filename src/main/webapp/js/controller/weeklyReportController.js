
module.controller('WeeklyReportController', ['$scope','WeeklyReportService',function($scope, WeeklyReportService){
    WeeklyReportService.getList().success(function(data){
         $scope.list = data;
     });

    $scope.save = function(){
        WeeklyReportService.save($scope.weeklyReport).success(function(data){
            $scope.list.push(data);
        }).error(function(data){
            console.log(data);
        });
    }

    $scope.delete = function(id){
        WeeklyReportService.delete(id).success(function(data){
            for(var i in  $scope.list){
                if( $scope.list[i].id == id){
                    $scope.list.splice(i,1);
                }
            }
        }).error(function(data){
                console.log(data);
         });
    }
}]);

