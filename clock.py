class Clock:
    def __init__(self, h, m):
        self._hour = h
        self._min = m

        while self._min >= 60:
            self._min -= 60
            self._hour += 1

        if self._hour > 23:
            self._hour = self._hour % 24

        while self._min < 0:
            self._min += 60
            self._hour -= 1

        if self._hour < 0:
            self._hour = self._hour % 24



    def __str__(self):
        if self._hour < 10:
            hour_str = '0' + str(self._hour)
        else:
            hour_str = str(self._hour)
        if self._min < 10:
            min_str = '0' + str(self._min)
        else:
            min_str = str(self._min)

        return hour_str + ":" + min_str

    def __eq__(self, other):
        if self._hour != other._hour: return False
        if self._min != other._min: return False
        return True

    def add(self, m):
        tot_min = (self._hour * 60) + self._min
        tot_min += m
        self._hour = (tot_min // 60) % 24
        self._min = tot_min % 60

    def getHour(self):
        return self._hour

    def getMinute(self):
        return self._min
