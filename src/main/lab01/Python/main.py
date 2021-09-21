from Monitor import Monitor
from Student import Student
from University import University

"""
|====================================================|
|Create a program where you can manipulate a monitor |
|object which has color, dimensions and resolution   |
|====================================================|
"""

# Create a Monitor
Samsung = Monitor("Gray", "32 inch", "1920x1080")
print(Samsung)

# Update the Monitor's properties
Samsung.color = "Red"
Samsung.resolution = "800x600";

# Display the Changes
print(Samsung)

# Create a Second Monitor
BenQ = Monitor("White", "40inch", "3840x2160")

# Compare the 2 Monitors created
print(f"""
            -- Monitor #1 --
            {Samsung}
            -- Monitor #2 --
            {BenQ}
    """)

"""
|=============================================================|
|Implement a program where you should create                  |
|and and modify the following objects: university and student.|
|=============================================================|
"""

# Create 3 universities with some students

UTM = University("UTM", 1980)
UTM.students.append(Student("Bob", 20, 10))
UTM.students.append(Student("Tom", 18, 9))
UTM.students.append(Student("Kim", 21, 8))

USM = University("USM", 1990)
USM.students.append(Student("Beluga", 20, 8))
USM.students.append(Student("Skitle", 18, 8))
USM.students.append(Student("Hecker", 21, 8))

ULIM = University("ULIM", 1975)
ULIM.students.append(Student("Derek", 20, 5))
ULIM.students.append(Student("Mike", 18, 10))
ULIM.students.append(Student("Clay", 21, 5))

print(UTM)
print(f"Mean: {UTM.get_mean()}")

print(USM)
print(f"Mean: {USM.get_mean()}")

print(ULIM)
print(f"Mean: {ULIM.get_mean()}")