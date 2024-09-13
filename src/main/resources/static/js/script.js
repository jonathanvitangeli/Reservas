/**
document.getElementById('reservaForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const nombre = document.getElementById('nombre').value;
    const fechaInicio = document.getElementById('fechaInicio').value;
    const fechaFin = document.getElementById('fechaFin').value;
    const cabania = document.getElementById('cabania').value;
    const comentarios = document.getElementById('comentarios').value;

    const reserva = {
        nombre: nombre,
        fechaInicio: fechaInicio,
        fechaFin: fechaFin,
        cabania: cabania,
        comentarios: comentarios
    };

    fetch('/api/reserva', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(reserva)
    })
    .then(response => response.json())
    .then(data => {
        alert('Reserva creada con éxito');
    })
    .catch(error => {
        console.error('Error:', error);
    });
});

 * 
 */