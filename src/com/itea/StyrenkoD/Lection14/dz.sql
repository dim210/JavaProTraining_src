-- Задача 1
select p.name, c.name 
from page p join category c on p.category_id = c.id;

-- Задача 2
select p.name, sc.name 
from page p join sub_category sc on p.sub_category_id = sc.id
            join category c on sc.category_id = c.id;
            
-- Задача 3
select count(t.id) count_trip, p.name passenger_name
from Passenger p join Pass_in_trip pt on (p.id = pt.passenger_id)
	             join Trip t on (pt.trip_id = t.id)
group by p.name
order by count(t.id) desc, p.name;