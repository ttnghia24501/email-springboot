<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Verify your email</h2>
<@spring.bind "verificationForm"/>
<#if verificationForm?? && noErrors??>
    Sent a confirmation link to your inbox ${verificationForm.email}<br>
<#else>
    <form action="/email-verification" method="post">
        Email: <br>
        <@spring.formInput "verificationForm.email"/>
        <@spring.showErrors "<br>"/>
        <br><br>
        <input type="submit" value="submit">
    </form>
</#if>
</body>
</html>