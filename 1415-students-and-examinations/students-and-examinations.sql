# Write your MySQL query statement below
select s.student_id , s.student_name , sub.subject_name , Count(E.student_id) attended_exams from Students s
cross join Subjects sub
Left join Examinations E

on s.student_id = E.student_id and E.subject_name = sub.subject_name

group by s.student_id ,s.student_name, sub.subject_name
order by s.student_id , s.student_name , sub.subject_name;