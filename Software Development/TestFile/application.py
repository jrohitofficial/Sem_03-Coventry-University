from flask import Flask, render_template, request, redirect, url_for
from flask_mysqldb import MySQL



app = Flask(__name__)

app.config('MYSQL_HOST') = 'localhost'
app.config('MYSQL_USER') = 'root'
app.config('MYSQL_PASSWORD') = ''
app.config('MYSQL_DB') = 'DatabaseName'


mysql = MySQL(app)

@app.route('/')

def Index():
	return render_template('index.html')

@app.route('/insert', methods = ['POST'])


def insert():
	if request.method == "POST":
		name = request.form['name']
		email= request.form['email']
		phone= request.form['phone']

	cur = mysql.connection.cursor()
	cur.execute("INSERT INTO students (name, email, phone)
		     VALUSE (%s, %s, %s)", (name, email,phone))
	
	mysql.connection.commit()

	return redirect(url_for('Index'))


