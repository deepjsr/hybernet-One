"# My-Projects" 

 # Paste it in pom.xml
``` 
  <dependency>
  		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->

			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<version>8.0.31</version>
	</dependency>
		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
	<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.6.14.Final</version>
  </dependency>
  ```
  # Create one folder  in **src/main/resource/** and paste it
     
    ``` bash
    <persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
  http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
	version="2.1">

	<persistence-unit name="god">
		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
		<!-- <shared-cache-mode>ENABLE_SELECTIVE</shared-cache-mode> -->     <!-- for caching -->  
		<properties>
			<property name="javax.persistence.jdbc.driver"
				value="com.mysql.cj.jdbc.Driver" />
			<property name="javax.persistence.jdbc.url"
				value="jdbc:mysql://localhost:3306/hibernet_first" />
			<property name="javax.persistence.jdbc.user"
				value="root" />
			<property name="javax.persistence.jdbc.password"
				value="root@123jS" />
			<property name="hibernate.show_sql" value="true" />


			<property name="hibernate.hbm2ddl.auto" value="update" />
			<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>
  			
			<!-- for caching 
			<property name="hibernate.cache.use_second_level_cache" value="true"></property>
			<property name="hibernate.cache.region.factory_class" value="org.hibernate.cache.ehcache.EhCacheRegionFactory"></property>
			--> 
			
		</properties>
	</persistence-unit>
   </persistence>
   ``` 
  ## To format in xml
  **ctrl+shift+f**
   
