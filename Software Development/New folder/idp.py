# Pass object as parameter and execute methods/objects real time

from abc import ABC, abstractmethod


class DBServer(ABC):
    @abstractmethod
    def connect(self):
        pass


class MySQLServer(DBServer):
    def connect(self):
        return "Conected to server."


class PgSQLServer(DBServer):
    def connect(self):
        return "Conneted to PgSQLServer"


class PageLoader():
    def load(self, conn: DBServer):
        return conn.connect()




p = PageLoader()
print(p.load(MySQLServer()))
print(p.load(PgSQLServer()))

