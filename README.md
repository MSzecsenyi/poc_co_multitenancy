Tutorial: https://www.baeldung.com/multitenancy-with-spring-data-jpa

./tenants folder tenant example:
~~~
#XfTenantID
name=tenant1

datasource.url=
datasource.username=
datasource.password=
datasource.driver-class-name=oracle.jdbc.OracleDriver
~~~

Request:</br>
Header param: XfTenantID</br>
endpoint: url/api/users