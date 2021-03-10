DELIMITER //
CREATE FUNCTION GetOrderHistory(brand varchar(100) )
RETURNS VARCHAR(20)
DETERMINISTIC
BEGIN
DECLARE orderedHistory varchar(100);
IF brand = 'benz' THEN
SET orderedHistory = '2019-10-23 13:23:50 ';
ELSEIF brand = 'bmw' THEN
SET orderedHistory = '2020-06-13 10:13:30';
ELSEIF brand = 'lambo' THEN
SET orderedHistory = '2016-03-30 20:30:10';
ELSEIF brand = 'rolls-royce' THEN
SET orderedHistory = '2019-08-12 11:22:55';
ELSEIF brand = 'audi' THEN
SET orderedHistory = '2021-02-20 18:34:44';
END IF;
RETURN (orderedHistory);
END