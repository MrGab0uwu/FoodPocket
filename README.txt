**** PAQUETES ****

El proyecto se va divir en paquetes con su respectivo JFRAME

Los paquetes son:

* Admin: Para la vista del Administrador de la base de datos, tiene control total del CRUD
* Home: Para la ventana de Bienvenida/Espera
* Media: Para las fotos, videos, etc.
* User: Para la vista del Usuario común, como si estuvieras en Rappi.
* Utilities: Para clases que nos sirvan para el performance de los objetos swing
* login (aun por crear) donde el usuario y admin se logearan y el sistema determinara
cual es cual.


ADMIN:
En admin se tiene los Jframe(por hacer) donde podra gestionar de forma simple los items
de la base de datos.

USER:
En user se tienen jframes para las necesidades basicas del usuario como buscar, agregar
y editar(si es que aprendo aun la wea esa web) sus propias recetas.

HOME:
En home se tiene un jframe con un timer, este paquete es para jframes meramente decorativos.

MEDIA:
En media, se tienen todos los recursos para dar vida a nuestro proyecto.

Utilities:
Clases que nos ayudan con los problemas de escalado de imagenes en los JLabels, y el
placeholder de los textfield(aún por implementar).


**** CODIGO *****

* CLASE USERVIEW:

En USER tenemos clases como resizeImages que nos ayudan con los problemas de imagenes,
    public void resizeImages() {
        ScaleImage resize = new ScaleImage();
        // Boton Hamburguesa para las opciones
        String burgerButton, userIcon, burger;
        burgerButton = "/media/burger_button.png";
        userIcon = "/media/guest.png";
        burger = "/media/burger.jpg";

	// Simplemente al objeto que hace el escalado y decimos que label con que imagen
        resize.scaleImage(burgerButton, this.burgerButton);
        resize.scaleImage(userIcon, this.userIcon);
        resize.scaleImage(burger, this.foodImage);
    }
Este bloque es bastante común de ver.

Tambien en la clase UserView se tiene el evento general donde el hijo clickeado tenga de
ancestro a un jpanel, habria otro jpanel de FoodView donde se vera la receta a fondo.

Es todo por el momento.
