# Write your MySQL query statement below
delete from Person
where id not in (
    select sub.min_id
    from (
        select MIN(id) as min_id, email
        from Person
        group by email
    ) sub
)