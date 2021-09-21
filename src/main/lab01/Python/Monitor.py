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