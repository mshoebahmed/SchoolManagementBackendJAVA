<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>

<head>
    <meta charset="ISO-8859-1">
    <title>DEV MODE</title>
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"> -->

    <link href="${contextPath}/resource/min/bootstrap.min.css" rel="stylesheet">
    <script src="${contextPath}/resource/min/angular-min.js"></script>
    <script src="${contextPath}/resource/min/angular-route.min.js"></script>

    <!-- controllers -->
    <script src="${contextPath}/resource/js/app.js"></script>

</head>

<body ng-app="myApp">
   <ng-route>

   </ng-route>
</body>

<script type="text/javascript">
    function redirect() {

        return window.location.assign("<%=request.getContextPath()%>/addstudent")
    }
</script>

</html>