
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String str = (String) request.getAttribute("msg");
            if (str != null) {
        %>
        <%=str%>
        <%}%>
        <form action="/OnlineShopping/CustomerController" method="post">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" autofocus="" autocomplete="off" placeholder="enter Username" title="a-z"  name="uname"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pwd" placeholder="enter Password"/></td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" placeholder="enter name"/></td>
                </tr>
                <tr>
                    <td>Emailid</td>
                    <td><input type="text" name="emailid" placeholder="enter email"/></td>
                </tr>
                <tr>
                    <td>Mobile Number</td>
                    <td><input type="text" name="mno" placeholder="enter Mobile number"/></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="city" placeholder="enter City"/></td>
                </tr>
                <tr>
                    <td>State</td>
                    <td><input type="text" name="state" placeholder="enter State"/></td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td><input type="text" name="country" placeholder="enter Country"/></td>
                </tr>
                <tr>
                    <td>Idtype</td>
                    <td>
                        <select name="idtype">
                            <option value="voterid">voterid</option>
                            <option value="aadharcard">adhaarcard</option>
                            <option value="pancard">pancard</option>
                            <option value="license">license</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Idno</td>
                    <td><input type="text" name="idno" placeholder="enter id number"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="opn" value="REGISTER"></td>

                </tr>
            </table>
        </form>
    </body>
</html>
