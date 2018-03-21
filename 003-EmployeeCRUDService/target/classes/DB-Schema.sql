CREATE TABLE `employee` (
	`empId` INT(11) NOT NULL,
	`firstName` VARCHAR(50) NULL DEFAULT NULL,
	`midName` VARCHAR(50) NULL DEFAULT NULL,
	`lastName` VARCHAR(50) NULL DEFAULT NULL,
	`salary` DOUBLE NULL DEFAULT NULL,
	PRIMARY KEY (`empId`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;

commit;


INSERT INTO employee (empId, firstName, midName, lastName, salary) VALUES (100, 'Ameya', 'J', 'Joshi', 55000)

commit;