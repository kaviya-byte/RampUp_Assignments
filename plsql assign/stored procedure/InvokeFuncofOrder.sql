DELIMITER //
CREATE PROCEDURE InvokeFuncofOrder()
BEGIN
DECLARE orderedHistroy VARCHAR(100);
DECLARE brandValue VARCHAR(100);
SET orderedHistroy = "The older date is ";
SELECT 
    p.brand
INTO brandValue FROM
    products p
WHERE
    p.id = 3;
SELECT 
    CONCAT(orderedHistroy,
            ' ',
            GETORDERHISTORY(brandValue));
END//
DELIMITER ;