

class PlainText():

    def __init__(self, text):
        self._text = text

    def render(self):
        return self._text


class Bold():

    def __init__(self, text: PlainText):
        self._text = text

    def render(self):
        return "<b> {} <b>".format(self._text.render())


class Italic():

    def __init__(self, text: PlainText):
        self._text = text

    def render(self):
        return "<i> {} <i>".format(self._text.render())


class Underline():

    def __init__(self, text: PlainText):
        self._text = text

    def render(self):
        return "<u> {} <u>".format(self._text.render())


# Plain text
plane = PlainText("Hello World!")

# Underlined
underline = Underline(plane)
print(underline.render())

# Bold
bold = Bold(plane)
print(bold.render())

# Italic
italic = Italic(plane)
print(italic.render())

# Now in combination
# The class need to have a common method/function.
combine = Italic(Bold(Underline(plane)))
print(combine.render())
