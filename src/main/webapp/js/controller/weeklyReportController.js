
module.controller('WeeklyReportController', ['$scope','WeeklyReportService',function($scope, WeeklyReportService){
    WeeklyReportService.getList().success(function(data){
         $scope.list = data;
     });

    $scope.saveWeeklyReport = function(){
        WeeklyReportService.save($scope.weeklyReport).success(function(data){
            $scope.list.push(data);
        });
    }

}]);

