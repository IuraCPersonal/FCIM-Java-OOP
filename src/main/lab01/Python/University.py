class University:

    def __init__(self, name: str, year: int):
        self.name = name
        self.year = year
        self.students = []

    def __str__(self):
        return f"""
            University: {self.name}
            Year : {self.year}
            Students : {[student.name for student in self.students]}
        """

    def get_mean(self):
        mean = 0.0

        for student in self.students:
            mean += student.mark

        return mean / len(self.students)
