<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Загрузка файла</title>
</head>
<body>

<h2>Загрузка файла</h2>

<form method="POST" enctype="multipart/form-data" action="/uploadFile">

    Выбрать файл для загрузки:
    <input type="file" name="file" multiple>
    <br/>
    <br/>
    <input type="submit" value="Загрузить">
    Загрузить файл!

</form>

</body>
</html>