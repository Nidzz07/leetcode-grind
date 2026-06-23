SELECT a.id
FROM Weather as a
JOIN Weather as b
ON a.recordDate = b.recordDate + INTERVAL 1 DAY
WHERE a.temperature>b.temperature;