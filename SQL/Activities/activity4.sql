REM   Script: activity4
REM   modifying the salesman table.

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

