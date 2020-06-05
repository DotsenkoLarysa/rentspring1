<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">Список Орендарів</h1>

<table>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Requisites</th>
    </tr>
    <#list tenants as tenant>
        <tr>
            <td>${tenant.id}</td>
            <td>${tenant.name}</td>
            <td>${tenant.requisites}</td>
        </tr>
    </#list>
</table>
</body>
</html>