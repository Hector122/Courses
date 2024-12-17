"use client";

import { usePathname } from "next/navigation";
import { Navbar, Container, Nav } from "react-bootstrap";

export default function NavBar() {
  const pathname = usePathname();

  return (
    <Navbar
      bg="primary"
      variant="dark"
      sticky="top"
      expand="sm"
      collapseOnSelect
    >
      <Container>
        <Navbar.Brand href="/">Nav Bar text - in Image Gallery</Navbar.Brand>
        <Navbar.Toggle aria-controls="main-navbar" />
        <Navbar.Collapse id="main-navbar">
          <Nav>
            <Nav.Link href="/static" active={pathname === "/static"}>
              Static
            </Nav.Link>
            <Nav.Link href="/static" active={pathname === "/dynamic"}>
              Dynamic
            </Nav.Link>
            <Nav.Link href="/static" active={pathname === "/isr"}>
              Isr
            </Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
}
