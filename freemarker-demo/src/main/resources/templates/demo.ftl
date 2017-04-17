格式：
<#if condition>
content
</#if>
<#if isLogin>
    已登录
<#else>
    请注册
</#if>

# list
<#list users as user>
    用户：${user.name},${user.age}
</#list>
