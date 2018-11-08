CREATE TABLE IF NOT EXISTS PROPERTIES (
  `KEY`         VARCHAR(1024),
  `VALUE`       VARCHAR(2048),
  `APPLICATION` VARCHAR(128),
  `PROFILE`     VARCHAR(128),
  `LABEL`       VARCHAR(128),
  PRIMARY KEY (`KEY`, `APPLICATION`, `PROFILE`, `LABEL`)
);

