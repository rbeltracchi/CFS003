select *
 from tabla_mascota;
-- seleccionar perdidos de ficha
select *
 from tabla_ficha
 where (estado="perdido");
 -- seleccionar perdidos de ficha con join a mascotas
 select m.nombre, f.descripcion, f.fecha
  from tabla_ficha as f
   inner join tabla_mascota as m ON f.idMascota=m.idMascota
    where (f.estado="perdido");
-- seleccionar perdidos en el parque
 select m.nombre, f.descripcion, f.fecha
  from tabla_ficha as f
   inner join tabla_mascota as m ON f.idMascota=m.idMascota
    where f.estado="perdido" AND f.descripcion like "zona parque";   