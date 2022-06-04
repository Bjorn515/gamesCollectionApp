<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<form role="selectPlatform" action="/selectPlatform" method="GET">
<select class="select" name="platform" action="./selectPlatform/${platform}" method="GET">
    <option value="option_select" disabled selected>Platforms</option>
    <option value="PC">PC</option>
    <option value="Playstation4">Playstation4</option>
    <option value="XboxOne">Xbox One</option>
</select>
<button class="butts" type="submit">Search by platform</button>
</form>
    
