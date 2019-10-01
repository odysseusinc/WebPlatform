To include Netezza driver download it, place here and point to it 
with -Dnetezza.driver.path, e.g.

```bash
mvn -Dnetezza.driver.path=src/drivers/nzjdbc.jar clean package
```

To include Hive driver download it, place here and point to it 
with -Dhive.driver.path, e.g.

```bash
mvn -Dhive.driver.path=src/drivers/hive-jdbc-standalone.jar clean package
``` 