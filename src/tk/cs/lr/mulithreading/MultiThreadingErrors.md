|               | Thread-01 | Thread-02 |
|:--------------|-----------|-----------|
| DeadLock      | c = a + b | b = d + c |
|               |           |           |
| RaceCondition |           |           |
|               | c = 5     |           |
|               |           | c = 10    |
