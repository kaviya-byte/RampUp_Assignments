DELIMITER //
CREATE PROCEDURE InvokeFunction()
BEGIN
DECLARE distinguishedFeature VARCHAR(100);
DECLARE brandValue VARCHAR(100);
SET distinguishedFeature = "The feature for ";
select p.brand into brandValue from products p where p.id = 3;
SELECT CONCAT(distinguishedFeature,' ',GetProductFeature(brandValue));
END //
DELIMITER ;

