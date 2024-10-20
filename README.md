A quick and dirty parser for the ChatGPT data takeout/export conversations JSON file.

Doesn't do anything yet - the ideal would be to see if this can be normalised and imported into a graph database or some other queryable database format, but for now all it can do is read the data into Java objects that you can do things with.

Some fields are not implemented. I think most of the important ones are. If OpenAI adds any fields to the export, this program will break - this is intentional, as I want to get warnings for every unexpected field until the implementation is better fleshed out.

Exported JSON files go into `src/main/resources/takeout-data/`. Make sure `conversations.json` is directly in this directory.
