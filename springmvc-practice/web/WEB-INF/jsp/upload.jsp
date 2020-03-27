<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/3/27
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="uploadImage" method="post" enctype="multipart/form-data">
    select one picture: <input type="file" name="image" accept="image/*"> <br>
    <input type="submit" value="upload">
</form>
