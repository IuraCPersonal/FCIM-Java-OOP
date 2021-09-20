
class Monitor:

    def __init__(self, color, dimension, resolution):
        self.color = color
        self.dimension = dimension
        self.resolution = resolution

    def __str__(self):
        return f"""
            Color      : {self.color}
            Dimension  : {self.dimension}
            Resolution : {self.resolution}
        """


Samsung = Monitor("Gray", "32 inch", "1920x1080")
print(Samsung)
