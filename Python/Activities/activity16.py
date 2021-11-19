class Car:
    def __init__(self, manufacturer, model, make, transmission, color) :
        self.model = model
        self.make = make
        self.manufacturer = manufacturer
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")
 
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")
	
car1 = Car("Maruti", "Alto", "2020", "Automatic", "Dual tone")
car2 = Car("Toyota", "Urben cruiser", "2021", "Manual", "White")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")
 
car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()