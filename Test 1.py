from selenium import webdriver
import time
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome(r"..\drivers\chromedriver.exe")
# driver = webdriver.Firefox(r"..\drivers\geckodriver.exe")
# driver = webdriver.Ie(r"..\drivers\IEDriverServer.exe")


driver.set_page_load_timeout(10)
driver.get("http://google.com")
driver.find_element_by_name("q").send_keys("Automation Step by Step")
driver.find_element_by_name("btnK").send_keys(Keys.ENTER)

driver.maximize_window()
driver.refresh()

print("Test completed successfully")

time.sleep(4)
driver.quit()




